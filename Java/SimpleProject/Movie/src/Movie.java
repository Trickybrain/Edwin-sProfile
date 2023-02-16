public class Movie {
        private String rating;//G, R
        private int id;
        private String title;

        public Movie()
        {
            rating = "";
            id = 0;
            title = "";
        }

        public Movie(String rate, int idd, String tit)
        {
            rating = rate;
            id =idd;
            title = tit;
        }

        public String getRating()
        {
            return rating;
        }

        public void setRating(String rate)
        {
            rating = rate;
        }

        public int getID()
        {
            return id;
        }

        public void setID(int idd)
        {
            id = idd;
        }

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String titlee)
        {
            title = titlee;
        }
        
        public double lateFee(int days)
        {
            return 2.0 * days;
        }

        public String calcLateFees(int days)
        {
            return "The late fee for this movie "+title+" is: "+lateFee(days)+" and is late for "+days+" days";
        }

        public boolean equals(Object obj)
        {
        	Movie other =(Movie)obj;
        	if(getClass() == obj.getClass()||id==other.id||title.equals(other.title))
                return true;
            else
            {
                return false;
            }
        }

        public String toString()
        {
            return "MPAA Rating: " + rating + "     ID Number: " + id
                    + "     Movie Title: " + title;
        }
    }
