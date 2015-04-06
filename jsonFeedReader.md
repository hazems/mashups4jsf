This component gives you the ability to get any JSON Feed in your JSF page.

| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| feedURL | true | The JSON feed URL. | NA |
| maximumCount | true | The maximum feed count. | NA |
| feedArrayName | true | The JSON feed array name. if set to 'none' this means that all the returned JSON feed is about anonymous JSON array. | NA |
| itemVar | true | The variable using which you will be able to access the JSON array item. Note that the returned item is of type (org.json.JSONArray). | NA |
| itemIndex | true | The JSON item index. | NA |