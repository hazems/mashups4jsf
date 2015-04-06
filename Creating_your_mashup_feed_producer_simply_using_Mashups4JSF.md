Producing Mashup Feeds using Mashups4JSF 1.0.0

Mashups4JSF provides an easy way for creating mashup feed source producer from existing domain classes by just using mainly two annotations. Let see an example of how to define mashup feed producer (atom or rss) using Mashups4JSF.

Assume the domain model have the following classes: News and NewsItems where News class has a list of NewsItems objects. To be able to export News data as Rss or Atom feed all what we should do is as follows:
```
package managedbeans;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.mashups.services.generic.api.Feed;
import com.googlecode.mashups.services.generic.api.FeedItems;

@Feed
public class News {
    static List  news = new ArrayList();
    
    // Generate random data (It can be got from the database).
    static {
		for (int i = 1; i <= 10; ++i) {
			news.add(new NewsItem("News Title" + i, 
					      "News Desc" + i, 
			  "http://www.google.com/search?q=" + i, 
					      "News Category" + i, 
					      "News Author" + i));
		}
    }
    
    @FeedItems
    public List getNews() {
	return news;
    }
    
    public String getTitle() {
	return "News Channel Title";
    }
    
    public String getDescription() {
	return "News Channel Description";
    }
    
    public String getLink() {
	return "http://www.google.com";
    }
}
```

As shown here, you need to annotate the feed source class with the @Feed annotation. The feed source class should be the provider of the mashup feed information. It should contains the following information:
  1. Feed Title which can be retrieved from any method that is annotated with the @FeedTitle annotation or will be retrieved automatically by calling the getTitle() method of the feed source class.
  1. Feed Description which can be retrieved from any method that is annotated with the @FeedDescription annotation or will be retrieved automatically by calling the getDescription() method of the feed source class.
  1. Feed Link which can be retrieved from any method that is annotated with the @FeedLink annotation or will be retrieved automatically by calling the getLink() method of the feed source class.
  1. Feed Items which can be retrieved from any method that is annotated with the @FeedItems annotation. The feed items should be a Java List object that contains list of feed items.

The feed item class should contain the following information:
  1. Item Title which can be retrieved from any method that is annotated with the @ItemTitle annotation or will be retrieved automatically by calling the getTitle() method of the feed item class.
  1. Item Description which can be retrieved from any method that is annotated with the @ItemDescription annotation or will be retrieved automatically by calling the getDescription() method of the feed item class.
  1. Item Link which can be retrieved from any method that is annotated with the @ItemLink annotation or will be retrieved automatically by calling the getLink() method of the feed item class.
  1. Item Category which can be retrieved from any method that is annotated with the @ItemCategory annotation or will be retrieved automatically by calling the getCategory() method of the feed item class.
  1. Item Author which can be retrieved from any method that is annotated with the @ItemAuthor annotation or will be retrieved automatically by calling the getAuthor() method of the feed item class.

Let's check the feed item class (NewsItems).

```
public class NewsItem {
    String title;
    String desc;
    String link;
    String category;
    String author;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return desc;
    }
    public void setDescription(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }	
    //...
}
```

As shown, we did nothing special, it is a simple POJO without any annotations.

Finally, in order to produce the feed data, we need to do two other things in the web.xml:
  * Declare the MashupFeedServlet of the Mashups4JSF as follows:
```
  <servlet>
	 <servlet-name>MashupFeedServlet</servlet-name>
     <servlet-class>com.googlecode.mashups.servlets.MashupFeedServlet</servlet-class>  
  </servlet>
  <servlet-mapping>
      <servlet-name>MashupFeedServlet</servlet-name>
      <url-pattern>/MashupFeedServlet</url-pattern>
  </servlet-mapping>    
```

  * Map the feed class to the feed id which you will use to show the feed information:
```
  <context-param>
      <param-name>NewsFeed</param-name>
      <param-value>managedbeans.News</param-value>
  </context-param>
```

This is all to do, you can now browse the mashup feed (whether RSS or ATOM) by calling the MashupFeedServlet as follows:
```
/MashupFeedServlet?feedID=NewsFeed&output=rss (For RSS)
/MashupFeedServlet?feedID=NewsFeed&output=atom (For ATOM)
```