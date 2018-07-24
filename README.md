# markdown-with-attrs

Simple wrapper around (markdown-it)[https://www.npmjs.com/package/markdown-it] parser and (markdown-it-attrs plugin)[https://www.npmjs.com/package/markdown-it-attrs]

[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.vaclavsynacek/markdown-with-attrs.svg)](https://clojars.org/org.clojars.vaclavsynacek/markdown-with-attrs)

## Overview


## Usage

```clojure
   (:require [markdown-with-attrs :as mwa])
   (mwa/markdown->html "# rulez {.big}\n\nParagraph of text {#the-paragraph}") 
   ;; => "<h1 class=\"big\">rulez</h1>\n<p id=\"the-paragraph\">Paragraph of text</p>\n"
```


## License

Copyright © 2018 Vaclav Synacek
BSD License
