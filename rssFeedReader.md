This component gives you the ability to get any RSS Feed in your JSF page.

| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| feedURL | true | The RSS feed URL. | NA |
| maximumCount | true | The maximum feed count. | NA |
| channelVar | true | The variable using which you will be able to access the RSS channel. | NA |
| itemVar | true | The variable using which you will be able to access the RSS item. Note that the returned item is of type (com.sun.syndication.feed.synd.SyndEntry). | NA |
| itemIndex | true | The RSS item index. | NA |
| includeCustomModules | false | If set to true then custom modules will be accessible as JSF EL. | false |