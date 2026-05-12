class Turbine
{
	String[] turbineNames;
	int currentIndex;
	
	Turbine(String[] turbineNames)
	{
		this.turbineNames = turbineNames;
	}
	
	void getTurbineName(String turbineName)
	{
		System.out.println("Executing the getTurbineName in StoreTurbineNames");
		System.out.println("Turbine name:" + turbineName);
		
		if(this.turbineNames != null)
		{
			int index = this.turbineNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.turbineNames[currentIndex] = turbineName;
				System.out.println("Turbine stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another turbineName in index:" + this.currentIndex);
			}
			else{
				System.out.println("turbineNames array is full");
			}
		}
		else{
			System.out.println("turbineNames array null");
		}
	}
	
	boolean searchTurbineName(String turbineName)
	{
		if(turbineName != null)
		{
			System.out.println("Searching for the " + turbineName + " in array");

			if(this.turbineNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");

				for(String name : this.turbineNames)
				{
					System.out.println("Comparing " + turbineName + " with " + name);

					if(name == turbineName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}

				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("turbineNames array is null");
			}
		}
		else{
			System.out.println("turbineName is null, search cannot be done");
		}
		return false;
	}
	
	 boolean update(int index, String newName)
    {
        System.out.println("Update by Index");
        if(this.turbineNames != null)
        {
            if(index >= 0 && index < this.turbineNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value: " + this.turbineNames[index]);
                    this.turbineNames[index] = newName;
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
        if(this.turbineNames != null)
        {
            if(oldName != null && newName != null)
            {
                int index = 0;
                for(String name : this.turbineNames)
                {
                    if(name != null && name == oldName)
                    {
                        this.turbineNames[index] = newName;
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
        if(this.turbineNames != null)
        {
            if(index >= 0 && index < this.turbineNames.length)
            {
                if(this.turbineNames[index] != null)
                {
                    String deleted = this.turbineNames[index];
                    this.turbineNames[index] = null;
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
        if(this.turbineNames != null)
        {
            if(name != null)
            {
                int index = 0;
                for(String value : this.turbineNames)
                {
                    if(value != null && value == name)
                    {
                        String deleted = this.turbineNames[index];
                        this.turbineNames[index] = null;
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