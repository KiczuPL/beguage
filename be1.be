
let globalnazmienna be 5

struct point
    f32->x
    f32->y
end

fn sth(f32 x, f32 y) -> i32
let lokalnazmienna be 3
show globalnazmienna
return x * y
end

let struct point a
a->x be 3.0f
a->y be 4.0f

show globalnazmienna
let localnazmienna be 777
show localnazmienna
show sth(a->x, a->y)
show localnazmienna

let iter be 5
go(iter >= 0)
    show iter
    if (iter == 0)
       show 8888888d
    end
    iter be iter - 1
end
