package com.mytectra.springboot.playground.datastore;

import java.util.List;
import java.util.Optional;

public interface ItemStore<T> {
    
	public void loadItem(List<T> items) throws Exception;
	
	public Optional<List<T>> getItems(int quantity);
}
