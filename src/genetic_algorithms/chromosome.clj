(defn randomize
  "Produce a sequence of # number between 0 and 127"
  [length]
  (repeatedly length #(rand-int 128)))
