dp.sh.Brushes.Xml=function(){this.CssClass="dp-xml";this.Style=".dp-xml .cdata { color: #ff1493; }.dp-xml .tag, .dp-xml .tag-name { color: #069; font-weight: bold; }.dp-xml .attribute { color: red; }.dp-xml .attribute-value { color: blue; }"};dp.sh.Brushes.Xml.prototype=new dp.sh.Highlighter;dp.sh.Brushes.Xml.Aliases=["xml","xhtml","xslt","html","xhtml"];
dp.sh.Brushes.Xml.prototype.ProcessRegexList=function(){var a=null,c=null;this.GetMatches(RegExp("(&lt;|<)\\!\\[[\\w\\s]*?\\[(.|\\s)*?\\]\\](&gt;|>)","gm"),"cdata");this.GetMatches(RegExp("(&lt;|<)!--\\s*.*?\\s*--(&gt;|>)","gm"),"comments");for(c=RegExp("([:\\w-.]+)\\s*=\\s*(\".*?\"|'.*?'|\\w+)*|(\\w+)","gm");null!=(a=c.exec(this.code));)if(null!=a[1]){var b=this.matches,d=new dp.sh.Match(a[1],a.index,"attribute");b[b.length]=d;void 0!=a[2]&&(b=this.matches,a=new dp.sh.Match(a[2],a.index+a[0].indexOf(a[2]),
"attribute-value"),b[b.length]=a)}this.GetMatches(RegExp("(&lt;|<)/*\\?*(?!\\!)|/*\\?*(&gt;|>)","gm"),"tag");for(c=RegExp("(?:&lt;|<)/*\\?*\\s*([:\\w-.]+)","gm");null!=(a=c.exec(this.code));)b=this.matches,a=new dp.sh.Match(a[1],a.index+a[0].indexOf(a[1]),"tag-name"),b[b.length]=a};