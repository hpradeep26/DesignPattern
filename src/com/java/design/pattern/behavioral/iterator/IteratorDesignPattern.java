package com.java.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorDesignPattern {
	
	public static void main(String[] args) {
		Playlist playlist = new Playlist();
		playlist.addSong("Song A");
		playlist.addSong("Song B");
		playlist.addSong("Song C");
		
		Iterator<String> iterator = playlist.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

interface Iterator<T>{
	boolean hasNext();
	T next();
}

interface IterableCollection<T>{
	Iterator<T> createIterator();
}

class Playlist implements IterableCollection<String>{
	private List<String> songs = new ArrayList<>();
	
	public void addSong(String song) {
		songs.add(song);
	}
	
	public int size() {
		return songs.size();
	}
	
	public String getSongAt(int index) {
	 return songs.get(index);	
	}
	
	
	
	@Override
	public Iterator<String> createIterator() {
		return new PlaylistIterator(this);
	}
	
}

class PlaylistIterator implements Iterator<String>{
	
	private final Playlist playlist;
	private int index = 0;
	

	public PlaylistIterator(Playlist playlist) {
		super();
		this.playlist = playlist;
	}

	@Override
	public boolean hasNext() {
		return index < playlist.size();
	}

	@Override
	public String next() {
		return playlist.getSongAt(index++);
	}
	
}