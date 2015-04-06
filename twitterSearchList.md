This component gives you the ability to search in the twitter tweets with your favorite search criteria.

| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| searchQuery | true | The twitter tweets search query. | NA |
| resultItemVar | true | The variable using which you will be able to access the twitter tweets result item. Note that the twitter result item is of type (com.googlecode.mashups.services.twitter.api.TwitterSearchResultItem). | NA |
| resultItemIndex | true | The Result item index. | NA |
| pageNumber | false | The twitter tweets page number. | 1 |
| resultSetSize | false | The twitter tweets search result set size. | 10 |
| showUser | false | This attribute determines whether to display the user that published the tweet. | true |
| resultType | false | The twitter search result type. It can have one of three values ("mixed", "recent", "popular"). | "recent" |
| sinceDate | false | Returns tweets with since the given date. Date should be formatted as YYYY-MM-DD. | NA |
| beforeDate | false | Returns tweets with generated before the given date.  Date should be formatted as YYYY-MM-DD. | NA |
| sinceID | false | Returns tweets with status ids greater than the given id. | NA |
| maxID | false | Returns tweets with status ids less than the given id. | NA |
| geocode | false | Returns tweets by users located within a given radius of the given latitude/longitude. The location is preferentially taking from the Geotagging API, but will fall back to their Twitter profile. The parameter value is specified by "latitide,longitude,radius", where radius units must be specified as either "mi" (miles) or "km" (kilometers). Note that you cannot use the near operator via the API to geocode arbitrary locations; however you can use this geocode parameter to search near geocodes directly. Example: '40.757929%2C-73.985506%2C25km'. | NA |
| locale | false | Specify the language of the query you are sending (only ja is currently effective). | NA |
| language | false | Restricts tweets to the given language, given by an ISO 639-1 code. | NA |