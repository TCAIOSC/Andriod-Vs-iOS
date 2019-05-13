import UIKit

 class Dog{
	var name:String = ""
	var breed:String = ""
	var age:Int = 0
	var color:String = ""
	init(name:String, breed:String, age:Int, color:String)  {
	self.name = name
	self.breed = breed
	self.age = age
	self.color = color

 }

	public func getName() -> String{
		return name
	}

	public func setName() {
		name = x
	}

}