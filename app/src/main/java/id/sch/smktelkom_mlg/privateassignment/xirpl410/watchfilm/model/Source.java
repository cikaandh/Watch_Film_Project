package id.sch.smktelkom_mlg.privateassignment.xirpl410.watchfilm.model;

import java.util.List;

/**
 * Created by hyuam on 18/04/2017.
 */

public class Source {
    //            "id": "abc-news-au",
    //            "name": "ABC News (AU)",
    //            "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
    //            "url": "http://www.abc.net.au/news",
    //            "category": "general",
    //            "language": "en",
    //            "country": "au",
    //            "urlsToLogos": {
    //                "small": "",
    //                "medium": "",
    //                "large": ""
    //            },
    //            "sortBysAvailable": ["top"]

    public String id;
    public String title;
    public String overview;
    public String poster_path;
    public String category;
    public String language;
    public String country;
    //public List<String> urlsToLogos;
    public List<String> sortBysAvailable;
    public int color;

}
