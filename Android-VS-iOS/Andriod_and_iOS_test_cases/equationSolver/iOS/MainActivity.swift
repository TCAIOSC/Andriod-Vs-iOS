import UIKit


 class MainActivity: UIViewController{
	private var a_value:Double = 0.0
	private var b_value:Double = 0.0
	private var c_value:Double = 0.0
	@IBOutlet weak var editTextA:UITextField!
	@IBOutlet weak var editTextB:UITextField!
	@IBOutlet weak var editTextC:UITextField!
	@IBOutlet weak var x1TextView:UILabel!
	@IBOutlet weak var x2TextView:UILabel!

	override internal func viewDidLoad() {
		super.viewDidLoad()
		editTextA.removeTarget(nil, action: nil, for: .allEvents)
		editTextA.addTarget(self, action: #selector(targetMethod0(_:)), for: .editingChanged)
		editTextB.removeTarget(nil, action: nil, for: .allEvents)
		editTextB.addTarget(self, action: #selector(targetMethod1(_:)), for: .editingChanged)
		editTextC.removeTarget(nil, action: nil, for: .allEvents)
		editTextC.addTarget(self, action: #selector(targetMethod2(_:)), for: .editingChanged)
	}

	private func setNewValues() {
		var determinant:Double = pow(b_value,Double(2)) - 4 * a_value * c_value
		var x1:String = "", x2:String = ""
		if determinant > 0 {
					var temp1:Double = -b_value / (2 * a_value)
					var temp2:Double = sqrt(Double(determinant)) / (2 * a_value)
					x1 = String((temp1 + temp2))
					x2 = String(temp1 - temp2)
				} else if determinant == 0 {
					x1 = String(-b_value / (2 * a_value))
					x2 = x1
				} else {
					var temp1:Double = -b_value / (2 * a_value)
					var temp2:Double = sqrt(Double(-determinant)) / (2 * a_value)
					x1 = String(temp1) + "+i" + String(temp2)
					x2 = String(temp1) + "-i" + String(temp2)
				}
		x1TextView.text = x1
		x2TextView.text = x2
	}

	@objc func targetMethod0(_ editable:UITextField){
		if editable.text!.count != 0 {a_value = Double(editable.text!)!} else {
		a_value = 0
		}
		setNewValues()
	}
	@objc func targetMethod1(_ editable:UITextField){
		if editable.text!.count != 0 {b_value = Double(editable.text!)!} else {
		b_value = 0
		}
		setNewValues()
	}
	@objc func targetMethod2(_ editable:UITextField){
		if editable.text!.count != 0 {c_value = Double(editable.text!)!} else {
		c_value = 0
		}
		setNewValues()
	}
}