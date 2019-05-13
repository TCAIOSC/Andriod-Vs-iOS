import UIKit

class Calculation{
	var z:Int = 0
	public func addition(ab:Int, y:Int) {
		z = ab + y
		print(z)
	}

	public func Subtraction(x:Int, y:Int) {
		z = x - y
		print(z)
	}

}
 class My_Calculation: Calculation{
	public func multiplication(x:Int, yy:Int) {
		z = x * yy
		print(z)
	}

	
}
var a:Int = 20, b:Int = 10
var demo:My_Calculation = My_Calculation()
demo.addition(ab:a ,y:b)
demo.Subtraction(x:a ,y:b)
demo.multiplication(x:a ,yy:b)