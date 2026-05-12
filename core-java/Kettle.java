class Kettle
{
	String[] kettleNames;
	int currentIndex;
	
	Kettle(String[] kettleNames)
	{
		this.kettleNames=kettleNames;
	}
	
	void getKettleName(String kettleName)
	{
		System.out.println("Executing the getKettleName in KettleNames");
		System.out.println("Kettle name:" + kettleName);
		
		if(this.kettleNames != null)
		{
			int index = this.kettleNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.kettleNames[currentIndex] = kettleName;
				System.out.println("Kettle stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another kettleName in index:" + this.currentIndex);
			}
			else{
				System.out.println("kettleNames array is full");
			}
		}
		else{
			System.out.println("kettleNames array null");
		}
	}
	
	boolean searchKettleName(String kettleName)
	{
		if(kettleName!=null)
		{
			System.out.println("Searching for the "+kettleName+" in array");
			if(this.kettleNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.kettleNames)
				{
					System.out.println("Comparing "+kettleName+" with "+name);
					
					if(name == kettleName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}	
              System.out.println("Name not found in the array...");				
			}
			else{
				System.out.println("kettleNames array is null");
			}
		}
		else{
			System.out.println("kettleName is null search operation cannot be done");
		}
		return false;
	}
	
	boolean update(int index, String newName)
    {
        if(this.kettleNames != null)
        {
            if(index >= 0 && index < this.kettleNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Before updating: " + this.kettleNames[index]);
                    this.kettleNames[index] = newName;
                    System.out.println("Updated at index " + index + " by " + newName);
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
	
	boolean update(String newName, String oldName)
    {
        if(this.kettleNames != null)
        {
            if(newName != null && oldName != null)
            {
                int index = 0;

                for(String name : this.kettleNames)
                {
                    if(name != null && name.equals(oldName))
                    {
                        this.kettleNames[index] = newName;
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
        if(this.kettleNames != null)
        {
            if(index >= 0 && index < this.kettleNames.length)
            {
				System.out.println("Index is valid,doing delete operation at index:"+index);
				
                if(this.kettleNames[index] != null)
                {
                    String deleted = this.kettleNames[index];
                    this.kettleNames[index] = null;

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
        if(this.kettleNames != null)
        {
            if(name != null)
            {
                int index = 0;

                for(String value : this.kettleNames)
                {
                    if(value != null && value == name)
                    {
                        String deleted = this.kettleNames[index];
                        this.kettleNames[index] = null;

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
