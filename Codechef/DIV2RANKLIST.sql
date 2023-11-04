select username as "Div 2 Ranklist"
from Results
where rating >= 1600 and rating < 2000
order by score desc;