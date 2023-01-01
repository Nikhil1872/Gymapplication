import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { DeleteComponent } from './components/delete/delete.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PlansComponent } from './components/plans/plans.component';
import { RegisterComponent } from './components/register/register.component';
import { ScheduleComponent } from './components/schedule/schedule.component';
import { LoginComponent } from './components/login/login.component';
import { UpdateComponent } from './components/update/update.component';
import { MainComponent } from './components/main/main.component';

const routes: Routes = [
   {path:'main',component:MainComponent},
  {path:'',component:MainComponent},
  {path:'about',component:AboutComponent},
  {path:'plans',component:PlansComponent},
  {path:'schedule',component:ScheduleComponent},
  {path:'login',component:LoginComponent,
  children:
  [{path:'delete',component:DeleteComponent},
  {path:'update',component:UpdateComponent}
  ]},
  {path:'delete',component:DeleteComponent},
  {path:'register',component:RegisterComponent},
  {path:'update',component:UpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
