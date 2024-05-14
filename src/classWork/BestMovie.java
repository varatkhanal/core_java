package classWork;

import java.util.ArrayList;

public class BestMovie {
	
	public Movie testRating(ArrayList<Movie> movieList) {
		Movie hrm=movieList.get(0);
		for(int i=0; i<movieList.size();i++) {
			if(hrm.getRating()<movieList.get(i).getRating()) {			
				hrm=movieList.get(i);
			}
		}
		return hrm;
	}

}
