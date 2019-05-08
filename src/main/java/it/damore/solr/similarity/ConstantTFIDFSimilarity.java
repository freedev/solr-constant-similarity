package it.damore.solr.similarity;

import org.apache.lucene.search.similarities.ClassicSimilarity;

public class ConstantTFIDFSimilarity extends ClassicSimilarity {
  
  @Override
  public float tf(float freq)
  {
      return 1.0F;
  }
  
  @Override
  public float idf(long docFreq, long numDocs) {
    return 1.0F;
  }

  @Override
  public String toString() {
    return "ConstantTFSimilarity";
  }

}
