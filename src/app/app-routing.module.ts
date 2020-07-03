import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CallbackComponent } from './callback/callback.component';
import { PromiseComponent } from './promise/promise.component';
import { ObservableComponent } from './observable/observable.component';


const routes: Routes = [
  {path: 'callback', component: CallbackComponent},
  {path: 'promise', component: PromiseComponent},
  {path: 'observable', component: ObservableComponent},
  {path: '**', redirectTo: 'callback'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
