class Steel
{
	String[] steelNames;
	int currentIndex;
	
	Steel(String[] steelNames)
	{
		this.steelNames= steelNames;
	}
	
	void getSteelName(String steelName)
	{
		System.out.println("Execting the getSteelName in StoreSteelNames");
		System.out.println("Steel name:"+steelName);
		
		if(this.steelNames!=null)
		{
			int index= this.steelNames.length-1;
			System.out.println("Length:"+index);
			
			if(this.currentIndex<= index)
			{
				this.steelNames[currentIndex]= steelName;
				System.out.println("Steel stored at:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another steelName in index:"+this.currentIndex);
			}
			else{
				System.out.println("steelNames array is full");
			}
		}
		else{
			System.out.println("steelNames array is null");
		}
	}
	
	boolean searchSteelName(String steelName)
	{
		if(steelName != null)
		{
			System.out.println("Searching for the " + steelName + " in array");

			if(this.steelNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");

				for(String name : this.steelNames)
				{
					System.out.println("Comparing " + steelName + " with " + name);

					if(name == steelName) 
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}

				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("steelNames array is null");
			}
		}
		else{
			System.out.println("steelName is null, search cannot be done");
		}
		return false;
	}
	
	boolean update(int index, String newName)
    {
        System.out.println("Update by Index");
        if(this.steelNames != null)
        {
            if(index >= 0 && index < this.steelNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value: " + this.steelNames[index]);
                    this.steelNames[index] = newName;
                    System.out.println("Updated to: " + newName);
                    return true;
                }
                else{
                    System.out.println("New name is null");
                }
            }
            else{
                System.out.println("Invalid index");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return false;
    }

    boolean update(String oldName, String newName)
    {
        System.out.println("Update by Name");
        if(this.steelNames != null)
        {
            if(oldName != null && newName != null)
            {
                int index = 0;
                for(String name : this.steelNames)
                {
                    if(name != null && name == oldName)
                    {
                        this.steelNames[index] = newName;
                        System.out.println("Updated " + oldName + " to " + newName);
                        return true;
                    }
                    index++;
                }
                System.out.println("Old name not found");
            }
            else{
                System.out.println("Names cannot be null");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return false;
    }
	
	String delete(int index)
    {
        System.out.println("Delete by Index");
        if(this.steelNames != null)
        {
            if(index >= 0 && index < this.steelNames.length)
            {
                if(this.steelNames[index] != null)
                {
                    String deleted = this.steelNames[index];
                    this.steelNames[index] = null;
                    System.out.println("Deleted: " + deleted + " at index: " + index);
                    return deleted;
                }
                else{
                    System.out.println("No value at index");
                }
            }
            else{
                System.out.println("Invalid index");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return null;
    }

    String delete(String name)
    {
        System.out.println("Delete by Name");
        if(this.steelNames != null)
        {
            if(name != null)
            {
                int index = 0;
                for(String value : this.steelNames)
                {
                    if(value != null && value == name)
                    {
                        String deleted = this.steelNames[index];
                        this.steelNames[index] = null;
                        System.out.println("Deleted: " + deleted + " at index: " + index);
                        return deleted;
                    }
                    index++;
                }
                System.out.println("Name not found");
            }
            else{
                System.out.println("Name is null");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return null;
    }
}