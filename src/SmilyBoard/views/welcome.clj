(ns SmilyBoard.views.welcome
  (:require [SmilyBoard.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to SmilyBoard"]))
