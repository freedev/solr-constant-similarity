# Solr constant-similarity aka Solr e-commerce similarity aka Solr Fixed Similarity

Sometime E-Commerce search needs to override similarity configuration (i.e. TF/IDF config), in order to avoid the relevance problem with term frequency.

Please see:

https://opensourceconnections.com/blog/2014/12/08/title-search-when-relevancy-is-only-skin-deep/

For example: looking for the term "airpods", products with the title "Airpods Strap For Apple Airpods..." are much more relevant than a product with the title "Airpods wireless Bluetooth earbuds by Apple"

Add this line in `solrconfig.xml`:

    <lib dir="../../../dist/" regex="constant-similarity-\d.*\.jar" />

And add this line into `schema.xml`:

    <similarity class="it.damore.solr.similarity.ConstantTFSimilarity"></similarity>

N.B. In this library ConstantTFSimilarity and ConstantTFIDFSimilarity extend the class ClassicSimilarity.
But ClassicSimilarity has been added only from Solr 5.4, so if you have an older Solr version, modify the source code and extend the class DefaultSimilarity instead.
