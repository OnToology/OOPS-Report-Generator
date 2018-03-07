/*
* Copyright 2012-2013 Ontology Engineering Group, Universidad Politecnica de Madrid, Spain
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/


package com.oeg.oops;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello, World");

        for(int i=0;i<args.length;i++){
            System.out.println("arg: "+args[i]);
        }
//        if(args.length<2){
//            System.out.println("expect 2 arguments: vocabulary-uri and output-directory");
//        }
//        else{
//            String uri = args[0];
//            String output_dir = args[1];
        if(true){
            String uri = "https://raw.githubusercontent.com/ahmad88me/demo/master/alo.owl";
            String output_dir = "./output";



            System.out.println("uri: "+uri);
            System.out.println("output dir: "+output_dir);



            try {

                HttpClient client = HttpClientBuilder.create().build();
                HttpGet request = new HttpGet(uri);
                request.setHeader("Accept", "application/rdf+xml");
                HttpResponse response = client.execute(request);
                if(response.getStatusLine().getStatusCode() == 200){
                    String contentType = response.getFirstHeader("Content-Type").getValue();
                    System.out.println("content type: "+contentType);
                }
            } catch (Exception e) {
                System.err.println("Error while doing http get: "+" in "+uri+" "+ e.getMessage());
            }




            //Vocabulary v = new Vocabulary(uri);
//            CreateOOPSEvalPage coep = new CreateOOPSEvalPage(v);
//            coep.createPage(output_dir);
        }


    }
}
