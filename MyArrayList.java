/** MyArrayList
 *  
 *  Students should complete all methods in the interface MyList.
 *  
 *  Add helper methods (private/protected) where useful. 
 *  Suggestions:  shiftUp, shiftDown, checkIndexRange, etc.
 *
 */

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {
	private E[] array;


	@SuppressWarnings("checked")
    public MyArrayList() {
        array = (E[]) new Object[10]; 
        size = 0;
    }
	


	public MyArrayList(int initialCapacity) {
		super();
		array =(E[]) new Object[initialCapacity]; // let fail if bad parameter
		size = 0;
		
	}

	/**
	 * Appends the specified Object to the end of this list
	 * 
	 * @param data
	 *            element to insert
	 * @return boolean success
	 */
	@Override
	public boolean add(E data) {
		
			if (this.size < this.array.length) {
				
			array[size] = data;
			size=size+1;
			
		
		
		return true;
			}
		@SuppressWarnings("unchecked")
		E[] holder = (E[]) new Object[size + 1];
		for(int i = 0; i < size; i++) {
			holder[i] = array[i];
		}
		holder[size] = data;
		
		array = holder;
		size += 1;
		return true;
	
		}
	

		
	
	
	/**
	 * Appends the specified Object to the list at the specified index
	 * 
	 * @param index
	 *            position to insert data
	 * @param data
	 *            element to insert
	 * @return boolean success
	 */
	@Override
	public boolean add(int index, E data) throws IndexOutOfBoundsException {
		if(size==array.length) {
			@SuppressWarnings("unchecked")
			E[] lim = (E[]) new Object[size + 1];
			for(int i=0;i<size;++i) {
				lim[i]=array[i];
			}
			array=lim;
		}
			for(int j=size;j>index;j--) {
				array[j]=array[j-1];
			}
				array[index]=data;
				size=size+1;
				return true;
			}
		
			
	
	/**
	 * Let the garbage collector do the heavy lifting!
	 */
	// @SuppressWarnings("unchecked")
	  @SuppressWarnings("unchecked")
	  
	  @Override
	  public void clear()
	  {
		  for(int z= 0;z<size;++z) {
			  array[z]=null;
		  }
	      size = 0;
	       
	  }

	/**
	 * Returns true if this list contains the specified Object
	 * 
	 * @param data
	 * @return boolean
	 */
	@Override
	public boolean contains(E data) {
		for(int i=0;i<size;++i) {
		
		
		if(array[i].equals(data)) {
			return true;	
		}
		}
		return false;
	}

	/**
	 * Returns the Object at the specified position in this list
	 * 
	 * @param index
	 * @return Object
	 * @throws Exception
	 *             if index out of range
	 */
	@Override
	public E get(int index) {
	return array[index];
	}
	@Override
 public int indexOf( E data) {
		for(int i = 0; i < size; i++) {
			if(array[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Returns the Object at the specified position in this list and deletes it
	 * from the list
	 * 
	 * @param index
	 *            element to remove
	 * @return Object element removed if found, else null
	 * @throws Exception
	 *             if index out of range
	 */
	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		E gone=array[index];
		int i=0;
		for(i=index;i<size-1;i++) {
			array[i]=array[i+1]	;
		}
		array[size-1] = null;
		size=size-1;
		
		return gone;
	}

	/**
	 * Returns the index of the first occurrence of the specified Object in this
	 * list, or -1 if this list does not contain the Object
	 * 
	 * @param data
	 *            element to search for
	 * @return int position of data if found, else -1
	 */
	@Override
	public int lastIndexOf(E data) {
		for(int i = size; i >= 0; i--) {
			if(array[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}


	/**
	 * Trims the capacity of this instance to be the list's current size. An
	 * application can use this operation to minimize the storage of an
	 * instance.
	 */
	@Override
		public void trimToSize() {
			@SuppressWarnings("unchecked")
			E[] hold = (E[]) new Object[size];
			
			for(int i = 0; i < size; i++) {
				hold[i] = array[i];
			}
			
			array = hold;
		}
		
		// ToDo
		// make array just this size
		// copy elements into it
		// list = newArray;
		
	
	@Override
	public String toString() {

		String s = "[";
		if (!isEmpty()) {
			for (int i=0; i< size-1; i++)
				s += array[i] + ", ";
			s += array[size-1];
		}
		return s += "]";
	}

	/**
	 * Grow array
	 */
	private void resize() {
		try {
			this.array = (E[])this.doubleArraySizeAndCopy();
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
		}
	}
	public int getCapacity() {
		return array.length;
	}
	

	/**
	 * Double size and copy elements.  
	 * @return Object[]
	 */
	// @SuppressWarnings("unchecked") // uncomment for generic type
	private Object[] doubleArraySizeAndCopy() {
		Object[] temp = (Object[]) new Object[this.array.length * 2];
		for (int i = 0; i < this.array.length; i++) {
			temp[i] = this.array[i];
		}
		
		return temp;
	}

	private boolean checkRange(int index) throws Exception {
		if (index < 0)
			throw new IllegalArgumentException("Index cannot be negative");
		if (index >= this.size)
			throw new IndexOutOfBoundsException(
					"Cannot access " + index + " element");
		return true;
	}	
	public String getIdentificationString() {
		return "Program 6, Andrew Botros";
	}
}
