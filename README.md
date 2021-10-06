# Solr constant-similarity aka Solr e-commerce similarity aka Solr Fixed Similarity

E-Commerce search sometimes needs to override the default similarity configuration (i.e. TF/IDF config), for example when have to avoid the relevance problem with term frequency.

For more informations see: https://opensourceconnections.com/blog/2014/12/08/title-search-when-relevancy-is-only-skin-deep/

For example: looking for the term "airpods", products with the title "Airpods Strap For Apple Airpods..." are much more relevant than a product with the title "Airpods wireless Bluetooth earbuds by Apple"

## Configuration steps

1. Add this line in `solrconfig.xml`:

`<lib dir="../../../dist/" regex="constant-similarity-\d.*\.jar" />`

2. And add this line into `schema.xml`:

`<similarity class="it.damore.solr.similarity.ConstantTFSimilarity"></similarity>`

## Old Solr versions (before 5.4)
N.B. In this library ConstantTFSimilarity and ConstantTFIDFSimilarity extend the class ClassicSimilarity.
But ClassicSimilarity has been added only from Solr 5.4, so if you have an older Solr version, you have to modify the Solr source code and extend the class DefaultSimilarity instead.
