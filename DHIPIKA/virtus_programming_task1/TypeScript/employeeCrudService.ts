/**
 * Simulates CRUD operations for employee records using an in-memory
 * store. No record values are hardcoded into the operations
 * themselves — every method takes its data as a parameter.
 */

interface Employee {
    id: number;
    name: string;
    department: string;
    salary: number;
}

class EmployeeService {
    private employees: Employee[] = [];
    private nextId: number = 1;

    /** Creates a new employee record and returns it. */
    create(name: string, department: string, salary: number): Employee {
        const employee: Employee = { id: this.nextId++, name, department, salary };
        this.employees.push(employee);
        return employee;
    }

    /** Reads a single employee by id, or undefined if not found. */
    read(id: number): Employee | undefined {
        return this.employees.find((emp) => emp.id === id);
    }

    /** Reads every employee record currently stored. */
    readAll(): Employee[] {
        return [...this.employees];
    }

    /** Updates the given fields of an existing employee. Returns success flag. */
    update(id: number, updates: Partial<Omit<Employee, "id">>): boolean {
        const employee = this.read(id);
        if (!employee) {
            return false;
        }
        Object.assign(employee, updates);
        return true;
    }

    /** Deletes an employee by id. Returns success flag. */
    delete(id: number): boolean {
        const initialLength = this.employees.length;
        this.employees = this.employees.filter((emp) => emp.id !== id);
        return this.employees.length < initialLength;
    }
}

// ---- Demo usage with dynamic sample data ----
function runDemo(): void {
    const service = new EmployeeService();

    const alice = service.create("Alice Fernandez", "Engineering", 75000);
    const bharat = service.create("Bharat Rao", "Sales", 52000);

    console.log("All employees:", service.readAll());

    service.update(alice.id, { salary: 80000, department: "Platform Engineering" });
    console.log("After update:", service.read(alice.id));

    service.delete(bharat.id);
    console.log("After deleting Bharat:", service.readAll());
}

runDemo();

export { Employee, EmployeeService };
