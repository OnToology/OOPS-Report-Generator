///*
// * Copyright 2012-2013 Ontology Engineering Group, Universidad Polit�cnica de Madrid, Spain
// *
// *  Licensed under the Apache License, Version 2.0 (the "License");
// *  you may not use this file except in compliance with the License.
// *  You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// *  Unless required by applicable law or agreed to in writing, software
// *  distributed under the License is distributed on an "AS IS" BASIS,
// *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *  See the License for the specific language governing permissions and
// *  limitations under the License.
// */
//
//package com.oeg.oops;
//
//import java.io.File;
//
///**
// *
// * Original @author Daniel Garijo
// * Edited by Ahmad Alobaid for OnToology needs
// */
//public class CreateOOPSEvalPage {
//    private final Vocabulary c;
//
//    public CreateOOPSEvalPage(Vocabulary v){
//        this.c = v;
//    }
//
//    public void createPage(String outpathFolder) {
//        //new folder in tmp, called Evaluation
//        File evalFolder = new File(outpathFolder);
//        try{
//            if(!evalFolder.exists())evalFolder.mkdir();
//            //do POST petition with evaluation.
//            String evaluation;
//            OOPSevaluation eval;
//            eval = new OOPSevaluation(c.getUri());
//            evaluation = eval.printEvaluation();
//            String pageTitle= evalFolder.getAbsolutePath()+File.separator+c.getUri().replace("https://","").replace("http://","").replace("/", "").replace("#", "").trim()+".html";
//            VocabUtils.saveDocument(pageTitle, TextConstants.getOntologyPageAndEvaluation(evaluation, c));
//        }catch(Exception e){
//            System.err.println("Error while saving OOPS evaluation: "+e.getMessage());
//        }
//    }
//
//}
