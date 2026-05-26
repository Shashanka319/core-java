class Cylinder
{
	String[] cylinderNames;
	int currentIndex;
	
	Cylinder(String[] cylinderNames)
	{
		this.cylinderNames=cylinderNames;
	}
	
	void getCylinderName(String cylinderName)
	{
		System.out.println("Executing the getCylinderName in StoreCylinder");
		System.out.println("Cylinder name:"+cylinderName);
		
		if(this.cylinderNames!=null)
		{
			int index=this.cylinderNames.length-1;
			System.out.println("Storing the cylinderName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.cylinderNames[currentIndex]=cylinderName;
				System.out.println("Cylinder name is stored in index:"+this.currentIndex);
				currentIndex++;
			    System.out.println("Storing another cylinderName in the index:"+this.currentIndex);
			}
			else{
				System.out.println("Cylinder array is full cannot store further");
			}
		}
		else{
			System.out.println("Cylinder array is null");
		}
	}
	
	boolean searchCylinderName(String cylinderName)
	{
		if(cylinderName!=null)
		{
			System.out.println("Searching for the "+cylinderName+" in array");
			
			if(this.cylinderNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.cylinderNames)
				{
					if(name== cylinderName)
					{
						System.out.println("Comparing the names in array...");
						System.out.println("Comparing "+name+" with "+cylinderName);
						return true;
					}
					else{
						System.out.println("Name not found in the array...");
						return false;
					}
				}		
			}
			else{
				System.out.println("cylinderNames array is null");
			}
		}
		else{
			System.out.println("cylinderName is null search operation cannot be done");
		}
		return false;
	}
	
	boolean update(int index, String newName)
	{ 
	    if(this.cylinderNames!=null)
		{
			if(index >=0 && index <  this.cylinderNames.length)
			{
				if(newName!=null)
				{
					System.out.println("Before updating: "+this.cylinderNames[index]);
					System.out.println("Name is not null and updating at the index:"+index);
					this.cylinderNames[index]= newName;
					System.out.println("Update is at index "+index+ " by "+newName);
					return true;
				}
					System.out.println("Given name is null,give proper name");
			}
			else{
				System.out.println("Index is not of array size give the proper index");
			}
		}else{
			System.out.println("cylinderNames array is null");
		}
		return false;
	}
	
	boolean update(String newName, String oldName)
	{
		if(this.cylinderNames!=null)
		{
			if(newName!=null && oldName!=null)
			{
				int index=0;
				System.out.println("updating oldName: "+oldName+" by newName: "+newName);
				
				for(String name: this.cylinderNames)
				{
					if(name!=null && name == oldName)
					{
						this.cylinderNames[index]= newName; 
						System.out.println("Updated name is:"+newName);
						return true;
					}
					index ++;
				}
				System.out.println("oldName: "+oldName+" cannot found cannot to update");
			}
			else{
				  System.out.println("newName and oldName is null cannot update");
				}
		}
		else
		{
			System.out.println("cylinderNames array is null cannot update");
		}
		return false;
	}
	
	String delete(int index)
	{
		if(this.cylinderNames != null)
		{
			if(index >= 0 && index < this.cylinderNames.length)
			{
				System.out.println("Index is valid and performing the delete operation at index: " + index);
				System.out.println("Array length: " + this.cylinderNames.length);

				if(this.cylinderNames[index] != null)
				{
					String deleted = this.cylinderNames[index];
					this.cylinderNames[index] = null;
					System.out.println("Deleted value: " + deleted + " at index: " + index);
					System.out.println("Value at index:" +index+" is:"+ this.cylinderNames[index]);
					return deleted;
				}
				else
				{
					System.out.println("No value present at given index");
					return null;
				}
			}
			else
			{
				System.out.println("Invalid index,cannot delete");
				return null;
			}
		}
		else{
			System.out.println("Array is null,cannot delete");
			return null;
		}
	}
	
	String delete(String name)
	{
		if(this.cylinderNames != null)
		{
			if(name != null)
			{
				System.out.println("Deleting by name: " + name);

				int index = 0;
				for(String value : this.cylinderNames)
				{
					if(value != null && value == name)
					{
						System.out.println("Name found at index: " + index);

						String deleted = this.cylinderNames[index];
						this.cylinderNames[index] = null;

						System.out.println("Deleted value: " + deleted + " at index: " + index);
						System.out.println("Value at index:" + index + " is:" + this.cylinderNames[index]);

						return deleted;
					}
					index++;
				}

				System.out.println("Given name not found, cannot delete");
				return null;
			}
			else
			{
				System.out.println("Given name is null, cannot delete");
				return null;
			}
		}
		else
		{
			System.out.println("Array is null,cannot delete");
			return null;
		}
	}
}
