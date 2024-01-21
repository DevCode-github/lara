import { HttpClient, HttpHeaders} from '@angular/common/http'
import { Injectable } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { catchError, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {
  headers: any;
  hidden = false;
  constructor(private httpClient: HttpClient,private cookieService:CookieService) {
    
    var token = "Bearer " + this.cookieService.get('token');
    console.log(token)
    this.headers = new HttpHeaders({
      'Access-Control-Allow-Origin':'*',
      'Access-Control-Expose-Headers': "Authorization",
      Authorization : token})
   }

  signup(appuser :any){
    return this.httpClient.post("http://localhost:9091/appuser/signup", appuser,{"headers" :this.headers})
  }
  login(appuser :any){
    return this.httpClient.post("http://localhost:9091/appuser/login", appuser,{"headers" :this.headers})
  }
  forgot(appuser :any){
    return this.httpClient.post("http://localhost:9091/appuser/forgot", appuser,{"headers" :this.headers})
  }
  reset(appuser :any){
    return this.httpClient.post("http://localhost:9091/appuser/reset", appuser,{"headers" :this.headers})
  }
  upload(imageFile :any){
    return this.httpClient.post("http://localhost:9091/appuser/upload", imageFile,{"headers" :this.headers})
  }
  fetch(id :any){
    return this.httpClient.post("http://localhost:9091/appuser/fetch", id,{"headers" :this.headers})
  }
  getBook(){
    return this.httpClient.get("http://localhost:9091/appuser/fetchbooks",{"headers" :this.headers})
  }
  update(appUser :any){
    return this.httpClient.post("http://localhost:9091/appuser/update",appUser,{"headers" :this.headers})
  }
}
