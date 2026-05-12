class ProductOperation{
	Product[] products;
	int currentIndex;
	
	ProductOperation(Product[] products){
		this.products=products;	
	}
	
	void save(Product product){
		System.out.println("Executing product Info in Product");
		if(this.products!=null && product!=null){
			int index=this.products.length-1;
			if(this.currentIndex<=index){
				this.products[currentIndex]=product;
				System.out.println("The Product Information Stored :"+product.name);
				System.out.println("Product Stored in index:"+currentIndex);
				this.currentIndex++;
				product.productInfo();
			}else{
				System.out.println("Array is Full Can Not Save");
			}
			
		}else{
			System.out.println("Array and Name is Null Check Once");
		}
	}
	void save(Product[] matireals){
		
		if(products.length<=10){
			System.out.println("Start to Storing the Products");
			int index= this.products.length-1;
			for(Product store:this.products){
				if(store!=null &&currentIndex<=index){
					
					System.out.println("Product Name:"+store.name);
				currentIndex++;
				}			
			}
		}else{
			System.out.println("Already store 10 products so can not store");
		}			
	}
	boolean search(int id){
		System.out.println("Executing the searchByUniqeId in ProductOperation");
		if(id!=0&& products!=null){
			for(Product product:this.products){
				if(product!=null);{
					System.out.println("product is Not Null so can search the Unique Id:"+id);
					if(product.uniquwId==id){
						System.out.println("Product Name is"+product.name+ "Having Unique Id as"+id);
						product.productInfo();
					}else{
						System.out.println("Unique Id is not Match");
					}
				}
			}
		}return false;
	}
	boolean search(int id, String name){
		System.out.println("Executing the searching of Id and Name");
		if(products!=null&&id!=0&&name!=null){
			for(Product searchs:this.products){
				if(searchs!=null){
					System.out.println("searchs is not null proceed to searching of id and name");
					if(searchs.uniquwId==id&&searchs.name==name){
						System.out.println("sceessfully search the name"+searchs.name+"with id of"+id);
						searchs.productInfo();
					}else{
						System.out.println("Any one of product detailes like id or name is not Match");
					}
				}
			}
		}return false;
	}
	boolean search(int id, String name,String country){
		if(products!=null&&id!=0&&name!=null&&country!=null){
			for(Product predict:this.products){
				if(predict!=null){
					System.out.println("Proceed to Search");
					if(predict.uniquwId==id&&predict.name==name&&predict.originCountry==country){
						System.out.println("the Name :"+predict.name+"and Id:"+id+"With:"+country+"are Founded");
					}else{
						System.out.println("Detailes are mismatch Check once");
					}
				}
			}
		}return false;
	}
	boolean search(String country){
		if(products!=null&&country!=null){
			for(Product search:this.products){
				if(search!=null){
					System.out.println("Proceed to Search");
					if(search.originCountry==country){
						System.out.println("Found the Country of Product Origin:"+country);
						search.productInfo();
					}
				}
			}
		}return false;
	}
	boolean check(int id, boolean expire)
	{
		if(products!=null&& id!=0&& expire!=false){
			for(Product check:products){
				if(check!=null){
					System.out.println("Proceed to check the id and expire of product");
					if(check.uniquwId==id){
						System.out.println("Unique id is Found "+id+"then check it expire or not");
						if(check.warrentyExpired==expire){
							return true;
						}else{
							return false;
						}
					}else{
						System.out.println("Unique id is Not found");
					}
				}
			}
		}
		return false;
	}
	void displayAllProducts(Product product){
		if(this.products!=null&& product!=null){
			System.out.println("Display All Products");
			for(Product info:this.products){
				if(info!=null){
				info.productInfo();
				}
			}
		}else{
			System.out.println("products and product are Null Check Once");
		}
	}
	boolean get(ProductType type)
	{
		if(products!=null&& type!=null){
			for(Product get:products){
				if(get!=null){
					System.out.println("Proceed to check the Product Type In Product");
					if(get.productType==type){
						System.out.println("Product Type is Found:"+type);
						get.productInfo();
						
					}else{
						System.out.println("Product Type is Not found");
					}
				}
			}
		}
		return false;
	}
	boolean get(ProductWarrentyYear wareentyYear)
	{
		if(products!=null&& wareentyYear!=null){
			for(Product ref:products){
				if(ref!=null){
					System.out.println("Proceed to check the Product Warrenty Years..");
					if(ref.productWarrentyYear==wareentyYear){
						System.out.println("Product wareentyYear is Found:"+wareentyYear);
						ref.productInfo();
					}else{
						System.out.println("Product wareentyYear is Not found");
					}
				}
			}
		}
		return false;
	}
}