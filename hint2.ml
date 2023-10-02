let rec foo (xs: 'a list): 'a = 
  let rec aux (n: int) (xs: 'a list): 'a = 
    match n, xs with
    | _, [] -> raise (Failure "Empty list")
    | n, _ when n < 0 -> raise (Failure "List had less than n elements")
    | 0, hd :: _ -> hd
    | n, _ :: tl -> aux (n-1) tl
  in aux ((List.length xs) / 2) xs

let _ = print_endline (foo ["U"; "P"; "S"; "I"; "L"; "O"; "N"])