import {GenreOptions} from "./GenreOptions";
import {RatingOptions} from "./RatingOptions";

export interface MovieCommand {

  title: string;
  director: string;
  year: number;
  genres: Array<GenreOptions>;
  rating: RatingOptions;
  url: string;
}
