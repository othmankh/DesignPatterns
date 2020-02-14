In this example, it is about how a forest can have trees 
in different places and positions, but some trees might have 
the same type in terms of name, texture and color. Therefore, 
we have a flyweight model called TreeType as they all share
the same intrinsic properties, but they don't share position.
In this way, we are just reusing types instead of having all
this information in the Tree Model, which helps in reducing 
memory usage.