import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../Model/Employee';
import { Observable } from 'rxjs';

@Injectable()
export class EmployeeService {

    emsUrl = 'http://localhost:1111/api/v1/ems';

    constructor(private httpClient: HttpClient) { }

    saveEmployee(employee: Employee): Observable<string> {

        return this.httpClient.post(
            this.emsUrl + '/employees',
            employee,
            { responseType: 'text' }
        );

    }

    updateEmployee(employee: Employee): Observable<string> {

        return this.httpClient.put(
            this.emsUrl + '/employees/' + employee.empId,
            employee,
            { responseType: 'text' }
        );

    }

    deleteEmployee(empId: number): Observable<string> {

        return this.httpClient.delete(
            this.emsUrl + '/employees/' + empId,
            { responseType: 'text' }
        );

    }

    findEmployee(empId: number): Observable<Employee> {

        return this.httpClient.get<Employee>(
            this.emsUrl + '/employees/' + empId
        );

    }

    findAllEmployees(): Observable<Employee[]> {

        return this.httpClient.get<Employee[]>(
            this.emsUrl + '/employees'
        );

    }


}