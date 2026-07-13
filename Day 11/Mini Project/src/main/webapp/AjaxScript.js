function getEmployeeDetails() {
	var eid = document.getElementById("eid").value;

	var req = new XMLHttpRequest();

	req.open("GET",
		"http://localhost:8081/WebApp-EMS/EmployeeServlet?eid="
		+ eid, true);

	req.onreadystatechange = function() {

		if (req.readyState == 4 && req.status == 200) {

			var result = req.responseText;
			var arr = result.split(" ");
			document.getElementById("ename").value = arr[0];
			document.getElementById("eid").value = arr[1];
			document.getElementById("dno").value = arr[2];
			document.getElementById("email").value = arr[3];
			document.getElementById("salary").value = arr[4];
		}
	};

	req.send();
}