import {Component} from '@angular/core';
import {MovieService} from "../../services/movie.service";
import {FormInit} from "../../models/FormInit";
import {GenreOptions} from "../../models/GenreOptions";
import {RatingOptions} from "../../models/RatingOptions";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent {

  genres: Array<GenreOptions> = [];
  ratings: Array<RatingOptions> = [];

  form: FormGroup;

  constructor(private movieService: MovieService, private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      title: [null],
      director: [null],
      year: [null],
      genres: [null],
      rating: [null],
      url: [null]
    })
  }

  ngOnInit() {
    this.movieService.getFormInitData().subscribe(
      (initData) => {
        this.genres = initData.genreOptions;
        this.ratings = initData.ratingOptions;
      }
    )
  }

  onSubmit() {
    this.movieService.createMovie(this.form.value).subscribe();
  }

}
