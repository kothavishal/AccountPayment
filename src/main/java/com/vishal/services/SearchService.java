package com.vishal.services;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.vishal.models.Item;

public class SearchService {

	public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(3);

	public List<Item> searchByName(String name) {

		List<Item> res = new ArrayList<>();

		return res;
	}

	public List<Item> searchByCategory(String category) {

		List<Item> res = new ArrayList<>();

		return res;
	}

	public List<Item> searchSynchronous(String name, String category) {

		List<Item> res = new ArrayList<>();

		List<Item> res1 = searchByName(name);

		List<Item> res2 = searchByCategory(category);

		res.addAll(res1);
		res.addAll(res2);

		return res;
	}

	public List<Item> searchASynchronous(String name, String category)
			throws ExecutionException, InterruptedException, TimeoutException {

		List<Item> res = new ArrayList<>();

		final Callable<List<Item>> callableSearchByName = new Callable<List<Item>>() {
			@Override
			public List<Item> call() {
				return searchByName(name);
			}
		};
		Future<List<Item>> futureSearchByName = EXECUTOR_SERVICE.submit(callableSearchByName);

		final Callable<List<Item>> callableSearchByCategory = new Callable<List<Item>>() {
			@Override
			public List<Item> call() {
				return searchByCategory(name);
			}
		};
		Future<List<Item>> futureSearchByCategory = EXECUTOR_SERVICE.submit(callableSearchByCategory);

		List<Item> res1 = futureSearchByName.get(2000, TimeUnit.MILLISECONDS);

		List<Item> res2 = futureSearchByCategory.get(3000, TimeUnit.MILLISECONDS);

		res.addAll(res1);
		res.addAll(res2);

		return res;
	}
}
