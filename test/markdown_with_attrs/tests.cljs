(ns markdown-with-attrs.tests
  (:require [cljs.test :refer-macros [deftest is are testing run-tests]]
            [markdown-with-attrs.core :refer [markdown->html]]))


(deftest examples
  (are [md html] (= (markdown->html md) html)

;; Some headings and paragraphs including classes and ids.
"# rulez {.big}\n\nParagraph of text {#the-paragraph}"
"<h1 class=\"big\">rulez</h1>\n<p id=\"the-paragraph\">Paragraph of text</p>\n"

;; Different markdown notations for em and strong.
"*one* _down_ **two** __doule__ ~~not~~"
"<p><em>one</em> <em>down</em> <strong>two</strong> <strong>doule</strong> <s>not</s></p>\n"

))


(enable-console-print!)

(cljs.test/run-tests)

