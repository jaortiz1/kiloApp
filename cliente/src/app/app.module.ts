import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistroComponent } from './registro/registro.component';
import { MatButtonModule, MatCheckboxModule } from '@angular/material';
import { MenuSuperiorComponent } from './menu-superior/menu-superior.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatInputModule } from '@angular/material/input';
import { ListcampaignComponent } from './listcampaign/listcampaign.component';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { FormsModule } from '@angular/forms';
import { AuthService } from './services/auth.service';
import { NoteService } from './services/note.service';
import { MatTableModule } from '@angular/material/table';
import { MatStepperModule } from '@angular/material/stepper';
import { MatSelectModule } from '@angular/material/select';


import { HttpClientModule } from '@angular/common/http';



//Material
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistroComponent,
    MenuSuperiorComponent,
    ListcampaignComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatToolbarModule,
    MatInputModule,
    HttpClientModule,
    MatIconModule,
    MatListModule,
    FormsModule,
    MatTableModule,
    MatStepperModule,
    MatSelectModule
  ],
  providers: [AuthService, NoteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
