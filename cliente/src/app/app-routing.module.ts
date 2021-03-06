import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListcampaignComponent } from './listcampaign/listcampaign.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: 'listcampaign', component: ListcampaignComponent },
  { path: 'login', component: LoginComponent },
  { path: '', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
