import {Injectable} from '@angular/core';
import {FormInit} from "../models/FormInit";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {MovieCommand} from "../models/MovieCommand";

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http: HttpClient) {
  }

  getFormInitData(): Observable<FormInit> {
    return this.http.get<FormInit>("http://localhost:8080/api/movies/create");
  }

  createMovie(movieData: MovieCommand) {
    return this.http.post("http://localhost:8080/api/movies/create",movieData);
  }

}
