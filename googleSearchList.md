This component gives you the ability to search in the Google web with your favorite search criteria.

| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| searchQuery | true | The Google search query. | NA |
| resultItemVar | true | The variable using which you will be able to access the Google result item. Note that the Google result item is of type (com.googlecode.mashups.services.google.api.GoogleSearchResultItem). | NA |
| resultItemIndex | true | The Result item index. | NA |
| startResultIndex | false | The Google search start result index. | 0 |
| resultSetSize | false | The Google search result set size. It can have one of two values "large" or "small". | large |
| hostLanguage | false | The host language of the application making the request. | en |
| key | false | The valid key associated with your site which is validated against the passed referer header. You can ignore it. | NA |