class Person
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "Name : "+name+"		Age: "+age;
	}
}
class PersonDemo
{
	public static void main(String args[])
	{
		Person p[]=new Person[20];
		p[1]=new Person("Kiran",18);
		p[2]=new Person("Mahendra",20);
		p[3]=new Person("upendra",21);
		System.out.println(p[1]+"\n"+p[2]+"\n"+p[3]);
	}
}
