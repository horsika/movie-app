import { Component } from '@angular/core';
import {MovieListItem} from "../../models/MovieListItem";

@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrls: ['./movie-details.component.css']
})
export class MovieDetailsComponent {
  movie: MovieListItem = {
    id: 0,
    title:"Barbie",
    director: "Greta Gerwig",
    year: 2023
  }
}
