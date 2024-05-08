import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FeaturesComponent } from './features/features.component';
import { CoursalComponent } from './coursal/coursal.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule } from '@angular/forms';
import { FreeVideosComponent } from './free-videos/free-videos.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { Route, RouterModule, Routes } from '@angular/router';
import { ɵBrowserAnimationBuilder } from '@angular/animations';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { RegistrationComponent } from './registration/registration.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import { SirenComponent } from './siren/siren.component';
import { EmergencycontactsComponent } from './emergencycontacts/emergencycontacts.component';
import { SharelocationComponent } from './sharelocation/sharelocation.component';
import { SelfDefenceWorkshopsComponent } from './self-defence-workshops/self-defence-workshops.component';
import { LowPowerNotificationComponent } from './low-power-notification/low-power-notification.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

const appRoute:Routes=[
  {path:'free-videos',component:FreeVideosComponent},
  {path:'contact-us',component:ContactUsComponent},
  {path:'about-us',component:AboutUsComponent},
  {path:'login',component:LoginComponent},
  {path:'sign-up',component:SignUpComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FeaturesComponent,
    CoursalComponent,
    FooterComponent,
    FreeVideosComponent,
    ContactUsComponent,
    AboutUsComponent,
    LoginComponent,
    SignUpComponent,
    RegistrationComponent,
    MainpageComponent,
    SirenComponent,
    EmergencycontactsComponent,
    SharelocationComponent,
    SelfDefenceWorkshopsComponent,
    LowPowerNotificationComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(appRoute),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
