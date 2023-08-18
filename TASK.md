1. Translate the following Entities into a sql query that will be used to create corresponding tables in a MS SQL database called payroll:
   * Employee has fields - Id, Name, Phone, Address, Date of birth, Joined Date, Department and Employee Category.
   * Department has fields - Id, Name, Description, Manager. A manager is also an employee
   * Employee Category has fields - Id, Name and Description.
   * Salary Rate has fields - Id, Employee Category, Level and Amount
   
2. Create a set of REST apis that will be used to manage the entities in the database payroll as follows:
   * Create a new employee: POST /api/employees
   * Update an existing employee: UPDATE /api/employees/{employeeId}
   * Retrieve employees: GET /api/employees
   * Retrieve an employee: GET /api/employees/{employeeId}
   * Create a new department: POST /api/departments
   * Update an existing department: UPDATE /api/departments/{departmentId}
   * Retrieve departments: GET /api/departments
   * Retrieve an department: GET /api/departments/{departmentId}
   * Create a new employee category: POST /api/employeecategories
   * Update an existing employee category: UPDATE /api/employeecategories/{categoryId}
   * Retrieve employee categories: GET /api/employeecategories
   * Retrieve an employee category: GET /api/employeecategories/{categoryId}
   * Create a new salary rate: POST /api/salaryrates
   * Update an existing salary rate: UPDATE /api/salaryrates/{rateId}
   * Retrieve salary rates: GET /api/salaryrates
   * Get all employees for a specific salary rate: GET /api/salaryrates/{rateId}/employees
   * Get all employees for a specific department: GET /api/departments/{departmentId}/employees
   * Get all employees manage by a specific manager: GET /api/{employeeId}/employees
   
3. Test the REST apis and share the collection once completed so that integration with the mobile application can commence as soon as possible.