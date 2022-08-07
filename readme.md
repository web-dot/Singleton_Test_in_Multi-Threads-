## Singleton implementations tests using Multiple Threads.

### below outputs while running main class demonstrates the success or failure of the Singleton implementaion on each run.

TSafeSingleton :

run1 :\
T2 inside getInstance()\
T2 inside null check\
T2 created instance\
T1 inside getInstance()

run2 :\
T2 inside getInstance()\
T1 inside getInstance()\
T1 inside null check\
T2 inside null check\
T2 created instance\
T1 created instance

Note: TSafe Singleton is not TSafe

