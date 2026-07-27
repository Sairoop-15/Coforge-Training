import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { MyChild1 } from './my-child1/my-child1';
import { MyChild2 } from './my-child2/my-child2';
import { FormsModule } from '@angular/forms';
import { StructuralDirective } from './structural-directive/structural-directive';
import { CalculatorService } from './calculator-service';
import { Addition } from './addition/addition';
import { Subtraction } from './subtraction/subtraction';
import { EmployeeComponent } from './employee-component/employee-component';
import { Home } from './home/home';
import { About } from './about/about';
import { Contact } from './contact/contact';

@NgModule({
  declarations: [
    App,
    MyChild1,
    MyChild2,
    StructuralDirective,
    Addition,
    Subtraction,
    Home,
    About,
    Contact,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, EmployeeComponent],
  providers: [provideBrowserGlobalErrorListeners(), CalculatorService],
  bootstrap: [App],
})
export class AppModule {}
