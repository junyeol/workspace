package class01;
	class Animal {
		String type;
		String name;
		Animal(String type){
			this(type,"무명");
			
		}
		Animal(String type,String name){
			this.type=type;
			this.name=name;
			
		}
		void hello() {
			System.out.println(this.type+" "+this.name);
		}
	}
	class Cat extends Animal {
		Cat(){
			this("나비");
			
		}
		Cat(String name){
			super("고양이",name);
			
		}
		@Override
		void hello() {
			System.out.print("야옹 ");
			super.hello();
		}
	
		
	}
	class Dog extends Animal{
		Dog(){
			this("흰둥이");
	
		}
		Dog(String name){
			super("강아지",name);
	
		}
		@Override
		void hello() {
			System.out.print("멍멍 ");
			super.hello();
		}
		
		
	
	
		
		
		
	}
	
	public class Test01 {
		public static void main(String[] args) {
			Dog d = new Dog();
			d.hello();
			System.out.println();
			Cat cat=new Cat();
			cat.hello();
		}
	}
	
