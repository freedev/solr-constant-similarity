# constant-similarity aka e-commerce similarity

E-Commerce search needs to override ClassicSimilarity in order to avoid the relevance problem with term frequency.

Please see:

https://opensourceconnections.com/blog/2014/12/08/title-search-when-relevancy-is-only-skin-deep/

For example: looking for the term "airpods", products with the title "Airpods Strap For Apple Airpods..." are much more relevant than a product with the title "Airpods wireless Bluetooth earbuds by Apple"

Add this line in `solrconfig.xml`:

    <lib dir="../../../dist/" regex="constant-similarity-\d.*\.jar" />

And add this line into `schema.xml`:

    <similarity class="it.damore.solr.similarity.ConstantTFSimilarity"></similarity>
