package org.elsys.manyToOne;

import java.util.ArrayList;
import java.util.Collection;

public class ManyToOne<M, O> {

	class Wrapper {
		public M wrapedKey;
		public O wrapedValue;
	}
	
	private ArrayList<Wrapper> map = new ArrayList<Wrapper>();
	
	/**
	 * Connects the given source with the given target. If this source was
	 * previously connected with another target the old connection is lost.
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	public void connect(M source, O target) {
		Wrapper w = new Wrapper();
		w.wrapedKey = source;
		w.wrapedValue = target;
		map.add(w);
	}
	

	/**
	 * @param source
	 * @return <code>true</code> if the relation contains the given source
	 */
	public boolean containsSource(M source) {
		for(Wrapper item : map){
			if(item.wrapedKey.equals(source)){
				return true;
			}
		}
		return false;
	}

	/**
	 * @param target
	 * @return <code>true</code> if the relation contains the given target
	 */
	public boolean containsTarget(O target) {
		for(Wrapper item : map){
			if(item.wrapedValue.equals(target)){
				return true;
			}
		}
		return false;
	}

	/**
	 * @param source
	 * @return the target with which this source is connected
	 * or null if target does not exist
	 */
	public O getTarget(M source) {
		for(Wrapper item : map){
			if(item.wrapedKey.equals(source)){
				return item.wrapedValue;
			}
		}
		return null;
	}

	/**
	 * @param target
	 * @return all the targets that are connected with this source or empty
	 *         collection if there are no sources connected with this target.
	 */
	public Collection<M> getSources(O target) {
		Collection<M> collection = new ArrayList<M>();
		for(Wrapper item : map){
			if(item.wrapedValue.equals(target)){
				collection.add(item.wrapedKey);
			}
		}
		return collection;
	}

	/**
	 * Removes the connection between this source and the corresponding target.
	 * Other sources will still point to the same target.
	 * 
	 * The target is removed if this was the only source pointing to it and
	 * {@link #containsTarget(Object)} will return false.
	 * 
	 * @param source
	 */
	public void disconnectSource(M source) {
		for(Wrapper item : map){
			if(item.wrapedValue.equals(source)){
				map.remove(item);
			}
		}
	}

	/**
	 * Removes the given target from the relation. All the sources that are
	 * pointing to this target are also removed.
	 * 
	 * If you take the "result" of {@link #getSources(target)} and after that
	 * call this method then {@link #containsSource(Object)} will return
	 * <code>false</code> for every object in "result".
	 * 
	 * @param target
	 */
	public void disconnect(O target) {
		for(Wrapper item : map){
			if(item.wrapedKey.equals(target)){
				map.remove(item);
			}
		}
	}

	/**
	 * @return a collection of the targets.
	 */
	public Collection<O> getTargets() {
		Collection<O> collection = new ArrayList<O>();
		for(Wrapper item : map){
			collection.add(item.wrapedValue);
		}
		return collection;
	}
}
